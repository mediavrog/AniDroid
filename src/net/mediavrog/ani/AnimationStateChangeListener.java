/*
AniDroid (an Android animation library)
Copyright (c) 2013 by Maik Vlcek

https://github.com/mediavrog/AniDroid

Based on:

Ani (a processing animation library)
Copyright (c) 2010 Benedikt Gro�

http://www.looksgood.de/libraries/Ani

Standing on the shoulders of giants:
Jack Doyle - TweenLite AS3 Library (http://blog.greensock.com/tweenlite/)
Robert Penner - Equations (http://robertpenner.com/easing/)
Andreas Schlegel - ControlP5 (http://www.sojamo.de/libraries/);
Ekene Ijeoma - Tween Processin Library (http://www.ekeneijeoma.com/processing/tween/)

AniCore, Ani and AniSequence includes many ideas and code of the nice people above!
Thanks a lot for sharing your code with the rest of the world!

This library is free software; you can redistribute it and/or modify it under the terms
of the GNU Lesser General Public License as published by the Free Software Foundation;
either version 2.1 of the License, or (at your option) any later version.

This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
See the GNU Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public License along with this
library; if not, write to the Free Software Foundation, Inc., 51 Franklin St, Fifth Floor,
Boston, MA 02110, USA
*/
package net.mediavrog.ani;

/**
 * @author maikvlcek
 * @since 5:46 PM - 7/16/13
 */
public interface AnimationStateChangeListener {
	public void onStart(Animation animation);
	public void onResume(Animation animation);
	public void onPause(Animation animation);
	public void onEnd(Animation animation);
	public void onDelayEnd(Animation animation);
	public void onUpdate(Animation animation);
}