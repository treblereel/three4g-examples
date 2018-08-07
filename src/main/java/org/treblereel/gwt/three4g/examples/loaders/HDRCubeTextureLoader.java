package org.treblereel.gwt.three4g.examples.loaders;

import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.loaders.OnErrorCallback;
import org.treblereel.gwt.three4g.loaders.OnLoadCallback;
import org.treblereel.gwt.three4g.loaders.OnProgressCallback;
import org.treblereel.gwt.three4g.loaders.managers.LoadingManager;
import org.treblereel.gwt.three4g.textures.CubeTexture;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 8/7/18.
 */
@JsType(isNative = true, namespace = "THREE")
public class HDRCubeTextureLoader {

    public HDRCubeTextureLoader() {

    }

    public HDRCubeTextureLoader(LoadingManager manager) {

    }

    /**
     * Begin loading from url and call onLoad with the parsed response content.
     *
     * @param type — A type, it could THREE.UnsignedByteType, see  DataTexture
     * @param url  — An array of strings containing the path/URL of the .hdr file.
     * @return instance of CubeTexture
     */
    public native CubeTexture load(int type, String[] url);

    /**
     * Begin loading from url and call onLoad with the parsed response content.
     *
     * @param type   — A type, it could THREE.UnsignedByteType, see  DataTexture
     * @param url    — An array of strings containing the path/URL of the .hdr file.
     * @param onLoad —  A function to be called after loading is successfully completed. The function receives the object having the following properties. geometryAtoms, geometryBonds and the JSON structure.
     * @return instance of CubeTexture
     */
    public native CubeTexture load(int type, String[] url, OnLoadCallback<CubeTexture> onLoad);

    /**
     * Begin loading from url and call onLoad with the parsed response content.
     *
     * @param type       — A type, it could THREE.UnsignedByteType, see  DataTexture
     * @param url        — An array of strings the path/URL of the .hdr file.
     * @param onLoad     —  A function to be called after loading is successfully completed. The function receives the object having the following properties. geometryAtoms, geometryBonds and the JSON structure.
     * @param onProgress —  A function to be called while the loading is in progress. The argument will be the XMLHttpRequest instance, which contains total and loaded bytes.
     * @return instance of CubeTexture
     */
    public native CubeTexture load(int type, String url[], OnLoadCallback<CubeTexture> onLoad, OnProgressCallback onProgress);

    /**
     * Begin loading from url and call onLoad with the parsed response content.
     *
     * @param type       — A type, it could THREE.UnsignedByteType, see  DataTexture
     * @param url        — An array of strings containing the path/URL of the .hdr file.
     * @param onLoad     —  A function to be called after loading is successfully completed. The function receives the object having the following properties. geometryAtoms, geometryBonds and the JSON structure.
     * @param onProgress —  A function to be called while the loading is in progress. The argument will be the XMLHttpRequest instance, which contains total and loaded bytes.
     * @param onError    —  A function to be called if an error occurs during loading. The function receives the error as an argument.
     * @return instance of CubeTexture
     */
    public native CubeTexture load(int type, String url[], OnLoadCallback<CubeTexture> onLoad, OnProgressCallback onProgress, OnErrorCallback onError);


}
