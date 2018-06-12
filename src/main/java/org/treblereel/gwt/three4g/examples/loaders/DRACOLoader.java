package org.treblereel.gwt.three4g.examples.loaders;

import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.loaders.OnErrorCallback;
import org.treblereel.gwt.three4g.loaders.OnLoadCallback;
import org.treblereel.gwt.three4g.loaders.OnProgressCallback;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 5/25/18.
 */
@JsType(isNative = true, namespace = "THREE")
public class DRACOLoader {

    public DRACOLoader() {

    }

    public static native void setDecoderPath(String path);

    public static native void setDecoderConfig(DRACOLoaderDecoderConfig config);

    public native void load(String url, OnLoadCallback onLoad);

    public native void load(String url, OnLoadCallback onLoad, OnProgressCallback onProgress);

    public native void load(String url, OnLoadCallback onLoad, OnProgressCallback onProgress, OnErrorCallback onError);

    public static native void releaseDecoderModule();

}
