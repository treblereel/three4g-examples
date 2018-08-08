package org.treblereel.gwt.three4g.examples.modifers;

import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.core.Geometry;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 8/8/18.
 */
@JsType(isNative = true, namespace = "THREE")
public class SimplifyModifier {
    //TODO deps on SimplifyModifier

    public native <T extends Geometry> T modify(Geometry geometry, double count);

}
