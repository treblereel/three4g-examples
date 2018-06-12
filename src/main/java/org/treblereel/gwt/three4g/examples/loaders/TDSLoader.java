package org.treblereel.gwt.three4g.examples.loaders;

import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.loaders.OnLoadCallback;
import org.treblereel.gwt.three4g.textures.Texture;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 6/9/18.
 */
@JsType(isNative = true, namespace = "THREE")
public class TDSLoader {
    public native void setPath(String s);

    public native Texture load(String s, OnLoadCallback onLoadCallback);

}
