package org.treblereel.gwt.three4g.examples.objects;

import jsinterop.annotations.JsType;
import org.treblereel.gwt.three4g.objects.Mesh;

/**
 * Creates a simulated lens flare that tracks a light.
 *
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 6/14/18.
 */
@JsType(isNative = true, namespace = "THREE")
public class Lensflare extends Mesh {

    /**
     * Used to check whether this or derived classes are lensflares. Default is true.
     * <p>
     * You should not change this, as it used internally for optimisation.
     */
    public boolean isLensflare;

    public Lensflare() {

    }

    public native void addElement(LensflareElement element);

    public native void dispose();
}
