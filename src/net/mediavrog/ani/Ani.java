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

import net.mediavrog.ani.easing.Easing;

/**
 * The Class Ani, helps you to create time based animations in an very easy way.
 * <p/>
 * Static usage:
 * Ani.to(this, 1.0, "x", 100, Ani.EXPO_IN_OUT);
 * <p/>
 * Or if you would like to keep a reference for a later use, there are this two options
 * Ani ani = Ani.to(this, 1.5, "x", 100, Ani.EXPO_IN_OUT);
 * Ani ani = new Ani(this, 1.5, "x", 100, Ani.EXPO_IN_OUT);
 * <p/>
 * For more see the examples
 */
public class Ani extends AniCore {
	private final static String TAG = Ani.class.getSimpleName();

	private static String defaultTimeMode = TIMEMODE_SECONDS;
	private static Easing defaultEasing = EXPO_OUT;
	private static String defaultAutostartMode = AUTOSTART;
	private static AnimationStateChangeListener defaultCallback = null;

	// -- constructors --

	/**
	 * Instantiates a new ani.
	 *
	 * @param theTarget    theTarget
	 * @param theDuration  theDuration
	 * @param theFieldName thefieldName
	 * @param theEnd       theEnd
	 */
	public Ani(Object theTarget, float theDuration, String theFieldName, float theEnd) {
		super(defaultAutostartMode, theTarget, theDuration, 0.0f, theFieldName, theEnd, defaultEasing, defaultTimeMode, defaultCallback);
	}

	/**
	 * Instantiates a new ani.
	 *
	 * @param theTarget    theTarget
	 * @param theDuration  theDuration
	 * @param theDelay     theDelay
	 * @param theFieldName theFieldName
	 * @param theEnd       theEnd
	 */
	public Ani(Object theTarget, float theDuration, float theDelay, String theFieldName, float theEnd) {
		super(defaultAutostartMode, theTarget, theDuration, theDelay, theFieldName, theEnd, defaultEasing, defaultTimeMode, defaultCallback);
	}

	/**
	 * Instantiates a new ani.
	 *
	 * @param theTarget    theTarget
	 * @param theDuration  theDuration
	 * @param theFieldName theFieldName
	 * @param theEnd       theEnd
	 * @param theEasing    theEasing
	 */
	public Ani(Object theTarget, float theDuration, String theFieldName, float theEnd, Easing theEasing) {
		super(defaultAutostartMode, theTarget, theDuration, 0.0f, theFieldName, theEnd, theEasing, defaultTimeMode, defaultCallback);
	}

	/**
	 * Instantiates a new ani.
	 *
	 * @param theTarget    theTarget
	 * @param theDuration  theDuration
	 * @param theDelay     theDelay
	 * @param theFieldName theFieldName
	 * @param theEnd       theEnd
	 * @param theEasing    theEasing
	 */
	public Ani(Object theTarget, float theDuration, float theDelay, String theFieldName, float theEnd, Easing theEasing) {
		super(defaultAutostartMode, theTarget, theDuration, theDelay, theFieldName, theEnd, theEasing, defaultTimeMode, defaultCallback);
	}

	/**
	 * Instantiates a new ani.
	 *
	 * @param theTarget    theTarget
	 * @param theDuration  theDuration
	 * @param theFieldName theFieldName
	 * @param theEnd       theEnd
	 * @param theEasing    theEasing
	 * @param theCallback  theCallback
	 */
	public Ani(Object theTarget, float theDuration, String theFieldName, float theEnd, Easing theEasing, AnimationStateChangeListener theCallback) {
		super(defaultAutostartMode, theTarget, theDuration, 0.0f, theFieldName, theEnd, theEasing, defaultTimeMode, theCallback);
	}

	/**
	 * Instantiates a new ani.
	 *
	 * @param theTarget    theTarget
	 * @param theDuration  theDuration
	 * @param theDelay     theDelay
	 * @param theFieldName theFieldName
	 * @param theEnd       theEnd
	 * @param theEasing    theEasing
	 * @param theCallback  theCallback
	 */
	public Ani(Object theTarget, float theDuration, float theDelay, String theFieldName, float theEnd, Easing theEasing, AnimationStateChangeListener theCallback) {
		super(defaultAutostartMode, theTarget, theDuration, theDelay, theFieldName, theEnd, theEasing, defaultTimeMode, theCallback);
	}


	// -- static functions --
	// create a Ani static functions

	/**
	 * animate to a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget    theTarget
	 * @param theDuration  theDuration
	 * @param theFieldName theFieldName
	 * @param theEnd       theEnd
	 * @return ani
	 */
	public static Ani to(Object theTarget, float theDuration, String theFieldName, float theEnd) {
		return createOne(false, theTarget, theDuration, 0.0f, theFieldName, theEnd, defaultEasing, defaultTimeMode, defaultCallback);
	}

	/**
	 * animate from a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget    theTarget
	 * @param theDuration  theDuration
	 * @param theFieldName theFieldName
	 * @param theEnd       theEnd
	 * @return ani
	 */
	public static Ani from(Object theTarget, float theDuration, String theFieldName, float theEnd) {
		return createOne(true, theTarget, theDuration, 0.0f, theFieldName, theEnd, defaultEasing, defaultTimeMode, defaultCallback);
	}

	/**
	 * animate to a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget    theTarget
	 * @param theDuration  theDuration
	 * @param theDelay     theDelay
	 * @param theFieldName theFieldName
	 * @param theEnd       theEnd
	 * @return ani
	 */
	public static Ani to(Object theTarget, float theDuration, float theDelay, String theFieldName, float theEnd) {
		return createOne(false, theTarget, theDuration, theDelay, theFieldName, theEnd, defaultEasing, defaultTimeMode, defaultCallback);
	}

	/**
	 * animate from a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget    theTarget
	 * @param theDuration  theDuration
	 * @param theDelay     theDelay
	 * @param theFieldName theFieldName
	 * @param theEnd       theEnd
	 * @return ani
	 */
	public static Ani from(Object theTarget, float theDuration, float theDelay, String theFieldName, float theEnd) {
		return createOne(true, theTarget, theDuration, theDelay, theFieldName, theEnd, defaultEasing, defaultTimeMode, defaultCallback);
	}

	// --

	/**
	 * animate to a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget    theTarget
	 * @param theDuration  theDuration
	 * @param theFieldName theFieldName
	 * @param theEnd       theEnd
	 * @param theEasing    theEasing
	 * @return ani
	 */
	public static Ani to(Object theTarget, float theDuration, String theFieldName, float theEnd, Easing theEasing) {
		return createOne(false, theTarget, theDuration, 0.0f, theFieldName, theEnd, theEasing, defaultTimeMode, defaultCallback);
	}

	/**
	 * animate from a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget    theTarget
	 * @param theDuration  theDuration
	 * @param theFieldName theFieldName
	 * @param theEnd       theEnd
	 * @param theEasing    theEasing
	 * @return ani
	 */
	public static Ani from(Object theTarget, float theDuration, String theFieldName, float theEnd, Easing theEasing) {
		return createOne(true, theTarget, theDuration, 0.0f, theFieldName, theEnd, theEasing, defaultTimeMode, defaultCallback);
	}

	/**
	 * animate to a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget    theTarget
	 * @param theDuration  theDuration
	 * @param theDelay     theDelay
	 * @param theFieldName theFieldName
	 * @param theEnd       theEnd
	 * @param theEasing    theEasing
	 * @return ani
	 */
	public static Ani to(Object theTarget, float theDuration, float theDelay, String theFieldName, float theEnd, Easing theEasing) {
		return createOne(false, theTarget, theDuration, theDelay, theFieldName, theEnd, theEasing, defaultTimeMode, defaultCallback);
	}

	/**
	 * animate from a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget    theTarget
	 * @param theDuration  theDuration
	 * @param theDelay     theDelay
	 * @param theFieldName theFieldName
	 * @param theEnd       theEnd
	 * @param theEasing    theEasing
	 * @return ani
	 */
	public static Ani from(Object theTarget, float theDuration, float theDelay, String theFieldName, float theEnd, Easing theEasing) {
		return createOne(true, theTarget, theDuration, theDelay, theFieldName, theEnd, theEasing, defaultTimeMode, defaultCallback);
	}

	// --

	/**
	 * animate to a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget    theTarget
	 * @param theDuration  theDuration
	 * @param theFieldName theFieldName
	 * @param theEnd       theEnd
	 * @param theEasing    theEasing
	 * @param theCallback  theCallback
	 * @return ani
	 */
	public static Ani to(Object theTarget, float theDuration, String theFieldName, float theEnd, Easing theEasing, AnimationStateChangeListener theCallback) {
		return createOne(false, theTarget, theDuration, 0.0f, theFieldName, theEnd, theEasing, defaultTimeMode, theCallback);
	}

	/**
	 * animate from a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget    theTarget
	 * @param theDuration  theDuration
	 * @param theFieldName theFieldName
	 * @param theEnd       theEnd
	 * @param theEasing    theEasing
	 * @param theCallback  theCallback
	 * @return ani
	 */
	public static Ani from(Object theTarget, float theDuration, String theFieldName, float theEnd, Easing theEasing, AnimationStateChangeListener theCallback) {
		return createOne(true, theTarget, theDuration, 0.0f, theFieldName, theEnd, theEasing, defaultTimeMode, theCallback);
	}

	/**
	 * animate to a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget    theTarget
	 * @param theDuration  theDuration
	 * @param theDelay     theDelay
	 * @param theFieldName theFieldName
	 * @param theEnd       theEnd
	 * @param theEasing    theEasing
	 * @param theCallback  theCallback
	 * @return ani
	 */
	public static Ani to(Object theTarget, float theDuration, float theDelay, String theFieldName, float theEnd, Easing theEasing, AnimationStateChangeListener theCallback) {
		return createOne(false, theTarget, theDuration, theDelay, theFieldName, theEnd, theEasing, defaultTimeMode, theCallback);
	}

	/**
	 * animate from a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget    theTarget
	 * @param theDuration  theDuration
	 * @param theDelay     theDelay
	 * @param theFieldName theFieldName
	 * @param theEnd       theEnd
	 * @param theEasing    theEasing
	 * @param theCallback  theCallback
	 * @return ani
	 */
	public static Ani from(Object theTarget, float theDuration, float theDelay, String theFieldName, float theEnd, Easing theEasing, AnimationStateChangeListener theCallback) {
		return createOne(true, theTarget, theDuration, theDelay, theFieldName, theEnd, theEasing, defaultTimeMode, theCallback);
	}


	// create multiple Ani static functions

	/**
	 * animate to a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget       theTarget
	 * @param theDuration     theDuration
	 * @param thePropertyList _property list
	 * @return ani[]
	 */
	public static Ani[] to(Object theTarget, float theDuration, String thePropertyList) {
		return createMultiple(false, theTarget, theDuration, 0.0f, thePropertyList, defaultEasing, defaultTimeMode, defaultCallback);
	}

	/**
	 * animate from a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget       theTarget
	 * @param theDuration     theDuration
	 * @param thePropertyList _property list
	 * @return ani[]
	 */
	public static Ani[] from(Object theTarget, float theDuration, String thePropertyList) {
		return createMultiple(true, theTarget, theDuration, 0.0f, thePropertyList, defaultEasing, defaultTimeMode, defaultCallback);
	}

	/**
	 * animate to a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget       theTarget
	 * @param theDuration     theDuration
	 * @param theDelay        theDelay
	 * @param thePropertyList _property list
	 * @return ani[]
	 */
	public static Ani[] to(Object theTarget, float theDuration, float theDelay, String thePropertyList) {
		return createMultiple(false, theTarget, theDuration, theDelay, thePropertyList, defaultEasing, defaultTimeMode, defaultCallback);
	}

	/**
	 * animate from a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget       theTarget
	 * @param theDuration     theDuration
	 * @param theDelay        theDelay
	 * @param thePropertyList _property list
	 * @return ani[]
	 */
	public static Ani[] from(Object theTarget, float theDuration, float theDelay, String thePropertyList) {
		return createMultiple(true, theTarget, theDuration, theDelay, thePropertyList, defaultEasing, defaultTimeMode, defaultCallback);
	}

	// --

	/**
	 * animate to a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget       theTarget
	 * @param theDuration     theDuration
	 * @param thePropertyList _property list
	 * @param theEasing       theEasing
	 * @return ani[]
	 */
	public static Ani[] to(Object theTarget, float theDuration, String thePropertyList, Easing theEasing) {
		return createMultiple(false, theTarget, theDuration, 0.0f, thePropertyList, theEasing, defaultTimeMode, defaultCallback);
	}

	/**
	 * animate from a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget       theTarget
	 * @param theDuration     theDuration
	 * @param thePropertyList _property list
	 * @param theEasing       theEasing
	 * @return ani[]
	 */
	public static Ani[] from(Object theTarget, float theDuration, String thePropertyList, Easing theEasing) {
		return createMultiple(true, theTarget, theDuration, 0.0f, thePropertyList, theEasing, defaultTimeMode, defaultCallback);
	}

	/**
	 * animate to a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget       theTarget
	 * @param theDuration     theDuration
	 * @param theDelay        theDelay
	 * @param thePropertyList _property list
	 * @param theEasing       theEasing
	 * @return ani[]
	 */
	public static Ani[] to(Object theTarget, float theDuration, float theDelay, String thePropertyList, Easing theEasing) {
		return createMultiple(false, theTarget, theDuration, theDelay, thePropertyList, theEasing, defaultTimeMode, defaultCallback);
	}

	/**
	 * animate from a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget       theTarget
	 * @param theDuration     theDuration
	 * @param theDelay        theDelay
	 * @param thePropertyList _property list
	 * @param theEasing       theEasing
	 * @return ani[]
	 */
	public static Ani[] from(Object theTarget, float theDuration, float theDelay, String thePropertyList, Easing theEasing) {
		return createMultiple(true, theTarget, theDuration, theDelay, thePropertyList, theEasing, defaultTimeMode, defaultCallback);
	}

	// --

	/**
	 * animate to a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget       theTarget
	 * @param theDuration     theDuration
	 * @param thePropertyList _property list
	 * @param theEasing       theEasing
	 * @param theCallback     theCallback
	 * @return ani[]
	 */
	public static Ani[] to(Object theTarget, float theDuration, String thePropertyList, Easing theEasing, AnimationStateChangeListener theCallback) {
		return createMultiple(false, theTarget, theDuration, 0.0f, thePropertyList, theEasing, defaultTimeMode, theCallback);
	}

	/**
	 * animate from a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget       theTarget
	 * @param theDuration     theDuration
	 * @param thePropertyList _property list
	 * @param theEasing       theEasing
	 * @param theCallback     theCallback
	 * @return ani[]
	 */
	public static Ani[] from(Object theTarget, float theDuration, String thePropertyList, Easing theEasing, AnimationStateChangeListener theCallback) {
		return createMultiple(true, theTarget, theDuration, 0.0f, thePropertyList, theEasing, defaultTimeMode, theCallback);
	}

	/**
	 * animate to a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget       theTarget
	 * @param theDuration     theDuration
	 * @param theDelay        theDelay
	 * @param thePropertyList _property list
	 * @param theEasing       theEasing
	 * @param theCallback     theCallback
	 * @return ani[]
	 */
	public static Ani[] to(Object theTarget, float theDuration, float theDelay, String thePropertyList, Easing theEasing, AnimationStateChangeListener theCallback) {
		return createMultiple(false, theTarget, theDuration, theDelay, thePropertyList, theEasing, defaultTimeMode, theCallback);
	}

	/**
	 * animate from a value over time to a certain value, returns an instance of ani
	 *
	 * @param theTarget       theTarget
	 * @param theDuration     theDuration
	 * @param theDelay        theDelay
	 * @param thePropertyList _property list
	 * @param theEasing       theEasing
	 * @param theCallback     theCallback
	 * @return ani[]
	 */
	public static Ani[] from(Object theTarget, float theDuration, float theDelay, String thePropertyList, Easing theEasing, AnimationStateChangeListener theCallback) {
		return createMultiple(true, theTarget, theDuration, theDelay, thePropertyList, theEasing, defaultTimeMode, theCallback);
	}


	// create a new Ani instance and add to lookup
	// or overwrite an existing Ani with new parameters
	private static Ani createOne(boolean theReverse, Object theTarget, float theDuration, float theDelay, String theFieldName, float theEnd, Easing theEasing, String theTimeMode, AnimationStateChangeListener listener) {
		Ani newAni = new Ani(theTarget, theDuration, theDelay, theFieldName, theEnd, theEasing, listener);
		if (theReverse) newAni.reverse();
		return newAni;
	}

	// property list style
	// create multiple new Ani instance at the same time and add to lookup
	// or overwrite an existing Ani with new parameters
	private static Ani[] createMultiple(boolean theReverse, Object theTarget, float theDuration, float theDelay, String thePropertyList, Easing theEasing, String theTimeMode, AnimationStateChangeListener theCallback) {
		String[] propertyList = thePropertyList.split(",");
		Ani[] tmpAnis = new Ani[propertyList.length];
		for (int i = 0; i < propertyList.length; i++) {
			String[] p = propertyList[i].trim().split(":");
			if (p.length == 2) {
				String fieldName = p[0];
				float end = Float.parseFloat(p[1]);
				tmpAnis[i] = createOne(theReverse, theTarget, theDuration, theDelay, fieldName, end, theEasing, theTimeMode, theCallback);
			}
		}
		return tmpAnis;
	}

	// -- get and set functions --

	/**
	 * Sets the defaultAutostartMode of all new created Animations to: On
	 */
	public static void autostart() {
		defaultAutostartMode = AUTOSTART;
	}

	/**
	 * Sets the defaultAutostartMode of all new created Animations to: Off
	 */
	public static void noAutostart() {
		defaultAutostartMode = NO_AUTOSTART;
	}

	/**
	 * Gets the defaultAutostartMode mode: AUTOSTART or NO_AUTOSTART
	 *
	 * @return the defaultAutostartMode
	 */
	public static String getAutostartMode() {
		return defaultAutostartMode;
	}

	/**
	 * Gets the defaultTimeMode.
	 *
	 * @return the default time mode
	 */
	public static String getDefaultTimeMode() {
		return defaultTimeMode;
	}

	/**
	 * Sets the defaultTimeMode: SECONDS or FRAMES
	 *
	 * @param theDefaultTimeMode the new default time mode
	 */
	public static void setDefaultTimeMode(String theDefaultTimeMode) {
		defaultTimeMode = theDefaultTimeMode;
	}

	/**
	 * Gets the default easing.
	 *
	 * @return the default easing
	 */
	public static Easing getDefaultEasing() {
		return defaultEasing;
	}

	/**
	 * Sets the default easing: LINEAR, QUAD_IN, QUAD_OUT, QUAD_IN_OUT, CUBIC_IN, CUBIC_IN_OUT, CUBIC_OUT, QUART_IN, QUART_OUT, QUART_IN_OUT, QUINT_IN, QUINT_OUT, QUINT_IN_OUT, SINE_IN, SINE_OUT, SINE_IN_OUT, CIRC_IN, CIRC_OUT, CIRC_IN_OUT, EXPO_IN, EXPO_OUT, EXPO_IN_OUT, BACK_IN, BACK_OUT, BACK_IN_OUT, BOUNCE_IN, BOUNCE_OUT, BOUNCE_IN_OUT, ELASTIC_IN, ELASTIC_OUT, ELASTIC_IN_OUT or use a Custom Easing
	 *
	 * @param theDefaultEasing the new default easing
	 */
	public static void setDefaultEasing(Easing theDefaultEasing) {
		defaultEasing = theDefaultEasing;
	}
}
