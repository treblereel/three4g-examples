package org.treblereel.gwt.three4g.examples.controls;

import elemental2.dom.HTMLElement;
import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.cameras.Camera;
import org.treblereel.gwt.three4g.core.events.EventDispatcher;
import org.treblereel.gwt.three4g.objects.Mesh;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 6/14/18.
 */
@JsType(isNative = true, namespace = "THREE")
public class DragControls extends EventDispatcher {

    public boolean enabled;

    public DragControls(Mesh[] objects, Camera camera, HTMLElement element) {

    }

    public native void activate();

    public native void deactivate();

    public native void dispose();

}
