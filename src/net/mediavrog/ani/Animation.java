package net.mediavrog.ani;

/**
 * @author maikvlcek
 * @since 11:09 AM - 7/17/13
 */
public interface Animation {
	// calculate the current values
	public void pre();

	public void seek(float theValue);

	public void start();

	public void resume();

	public void pause();

	public boolean isPlaying();

	public boolean isPaused();

	public boolean isEnded();

	public float getSeek();

	public float getDuration();

	public float getTime();

	public Object getTarget();
}