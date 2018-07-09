package org.treblereel.gwt.three4g.examples.renderers;

import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.cameras.OrthographicCamera;
import org.treblereel.gwt.three4g.scenes.Scene;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 6/27/18.
 */
@JsType(isNative = true, namespace = "THREE")
public class CanvasRenderer {
    public HTMLElement domElement;

    public native void setPixelRatio(double devicePixelRatio);

    public native void setSize(double innerWidth, double innerHeight);

    public native void render(Scene scene, OrthographicCamera camera);
}
