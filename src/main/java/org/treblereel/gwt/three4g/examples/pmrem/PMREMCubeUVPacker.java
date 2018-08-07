package org.treblereel.gwt.three4g.examples.pmrem;

import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.renderers.WebGLRenderTarget;
import org.treblereel.gwt.three4g.renderers.WebGLRenderTargetCube;
import org.treblereel.gwt.three4g.renderers.WebGLRenderer;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 8/7/18.
 */
@JsType(isNative = true, namespace = "THREE")
public class PMREMCubeUVPacker {

    public WebGLRenderTarget CubeUVRenderTarget;

    public PMREMCubeUVPacker(WebGLRenderTargetCube[] cubeLods) {

    }

    public native void update(WebGLRenderer renderer);

}
