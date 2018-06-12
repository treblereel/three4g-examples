package org.treblereel.gwt.three4g.examples.loaders;

import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.loaders.OnErrorCallback;
import org.treblereel.gwt.three4g.loaders.OnLoadCallback;
import org.treblereel.gwt.three4g.loaders.OnProgressCallback;
import org.treblereel.gwt.three4g.loaders.managers.LoadingManager;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 6/9/18.
 */
@JsType(isNative = true, namespace = "THREE")
public class FBXLoader {

    public FBXLoader() {

    }

    public FBXLoader(LoadingManager manager) {

    }

    /**
     * Begin loading from url and call onLoad with the response content.
     *
     * @param url — A string containing the path/URL of the .fbx file.
     */
    public native void load(String url);

    /**
     * Begin loading from url and call onLoad with the response content.
     *
     * @param url    — A string containing the path/URL of the .fbx file.
     * @param onLoad —  A function to be called after loading is successfully completed. The function receives the loaded SVGDocument as an argument.
     */
    public native void load(String url, OnLoadCallback onLoad);

    /**
     * Begin loading from url and call onLoad with the response content.
     *
     * @param url        — A string containing the path/URL of the .fbx file.
     * @param onLoad     —  A function to be called after loading is successfully completed. The function receives the loaded SVGDocument as an argument.
     * @param onProgress —  A function to be called while the loading is in progress. The argument will be the XMLHttpRequest instance, which contains total and loaded bytes.
     */
    public native void load(String url, OnLoadCallback onLoad, OnProgressCallback onProgress);

    /**
     * Begin loading from url and call onLoad with the response content.
     *
     * @param url        — A string containing the path/URL of the .fbx file.
     * @param onLoad     —  A function to be called after loading is successfully completed. The function receives the loaded SVGDocument as an argument.
     * @param onProgress —  A function to be called while the loading is in progress. The argument will be the XMLHttpRequest instance, which contains total and loaded bytes.
     * @param onError    —  A function to be called if an error occurs during loading. The function receives the error as an argument.
     */
    public native void load(String url, OnLoadCallback onLoad, OnProgressCallback onProgress, OnErrorCallback onError);

}
