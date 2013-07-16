AniDroid
========

An animation library by Benedikt Groß, ported to the programming environment Android by Maik Vlcek.

## What is it about?
Ani is a lightweight library for creating animations and transitions. Easily spoken Ani helps you to move things around on the screen or a bit more abstract, to animate any numeric variable.

## Notes on the port
This port of the original library differs in a few aspects:

* Removed dependency for processing.core.PApplet, meaning rewriting some parts of the code to use native methods of String, Math etc. instead of the PApplet helper methods. Furthermore some additional methods and a constant were added to the utility class AniUtil
* No support for timeMode FRAMES so far
* papplet.millis() is emulated using an millisecond offset (set in AniCore.start()) and System.getCurrentMillis() in AniCore.millis()
* removed demos and examples
* no precompiled library jar 

## Licence
This library is free software; you can redistribute it and/or modify it under the terms 
of the GNU Lesser General Public License as published by the Free Software Foundation; 
either version 2.1 of the License, or (at your option) any later version.

This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; 
without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. 
See the GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License along with this 
library; if not, write to the Free Software Foundation, Inc., 51 Franklin St, Fifth Floor, 
Boston, MA 02110, USA

## Disclaimer
Please find the original library for processing at [http://www.looksgood.de/libraries/Ani/](http://www.looksgood.de/libraries/Ani/).