package de.looksgood.ani;

public class AniUtil {

	/**
	 * @see <a href="http://processing.googlecode.com/svn/trunk/processing/build/javadoc/core/processing/core/PConstants.html">processing/core/PConstants</a>
	 */
	private static final float TWO_PI = 6.28318530717958647693f;

	/**
	 * Calculates the minimal difference of two angles given in radians.
	 * by Hartmut Bohnacker.
	 *
	 * @param theAngle1 Angle to subtract from
	 * @param theAngle2 Angle to subtract
	 * @return Angle between -PI and PI (-180� and 180�)
	 */
	public static float shortRotation(float theAngle1, float theAngle2) {
		float a1 = (theAngle1 % TWO_PI + TWO_PI) % TWO_PI;
		float a2 = (theAngle2 % TWO_PI + TWO_PI) % TWO_PI;

		if (a2 > a1) {
			float d1 = a2 - a1;
			float d2 = a1 + TWO_PI - a2;
			if (d1 <= d2) {
				return -d1;
			} else {
				return d2;
			}
		} else {
			float d1 = a1 - a2;
			float d2 = a2 + TWO_PI - a1;
			if (d1 <= d2) {
				return d1;
			} else {
				return -d2;
			}
		}
	}

	public static float constrain(float theValue, float min, float max) {
		return theValue < min ? min : (theValue > max ? max : theValue);
	}

	/**
	 * @see <a href="https://github.com/esmasui/processing-fragment/blob/master/core/src/processing/core/PApplet.java">processing/core/PApplet</a>
	 */
	public static final float map(float value,
								  float istart, float istop,
								  float ostart, float ostop) {
		return ostart + (ostop - ostart) * ((value - istart) / (istop - istart));
	}
}
