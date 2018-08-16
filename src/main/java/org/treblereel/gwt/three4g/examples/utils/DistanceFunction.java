package org.treblereel.gwt.three4g.examples.utils;

import jsinterop.annotations.JsFunction;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 3/5/18.
 */
@JsFunction
@FunctionalInterface
public interface DistanceFunction {
    Object onInvoke(double[] a, double[] b);
}
