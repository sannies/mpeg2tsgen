package CRC32;

/******************************************************************************
*
* Jacksum version 1.7.0 - checksum utility in Java
* Copyright (C) 2001-2006 Dipl.-Inf. (FH) Johann Nepomuk Loefflmann,
* All Rights Reserved, http://www.jonelo.de
*
* This program is free software; you can redistribute it and/or
* modify it under the terms of the GNU General Public License
* as published by the Free Software Foundation; either version 2
* of the License, or (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
*
* You should have received a copy of the GNU General Public License
* along with this program; if not, write to the Free Software
* Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
*
* E-mail: jonelo@jonelo.de
*
*****************************************************************************/

public class Crc32Mpeg2 extends Cksum {

    public void reset() {
        // MPEG-2 CRC initialised to FFFFFFFF
        value = 0xFFFFFFFF;
        length = 0;
    }

    // this method is provided in the superclass, but 'value' is overriden
    // the MPEG2 CRC is just the raw value as below
    public long getValue() {
       return (value & 0xFFFFFFFFL);
    }

}
