package org.treblereel.gwt.three4g.examples.modifers;

import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.core.AbstractGeometry;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 8/8/18.
 */
@JsType(isNative = true, namespace = "THREE")
public class TessellateModifier {

    public TessellateModifier(int size) {

    }

    public native void modify(AbstractGeometry geometry);

}
