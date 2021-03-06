package org.treblereel.gwt.three4g.examples;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.ScriptInjector;
import org.treblereel.gwt.three4g.examples.resources.ThreeJsExamplesTextResource;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 3/26/18.
 */
public class Examples implements EntryPoint {

    @Override
    public void onModuleLoad() {
        load();
    }

    public static void load() {
        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeOrbitControlsJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeDecalGeometryJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeConvexGeometryJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeBufferGeometryUtilsJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeSceneUtilsJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeCSS2DRendererJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeCSS3DRendererJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeSVGRendererJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeQuickHullJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeLutJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeGLTFExporterJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeBabylonLoaderJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeGLTFLoaderJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeDRACOLoaderJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeLoaderSupportJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeOBJLoaderJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeOBJLoader2JS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeColladaLoaderJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreePCDLoaderJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreePDBLoaderJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeSVGLoaderJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeTGALoaderJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreePRWMLoaderJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeWebVRJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeDaydreamControllerJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getThreeViveControllerJS().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getTDSLoader().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getFBXLoader().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getZlib().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getMTLLoader().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getLensflare().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getReflector().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getDragControls().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getPLYLoader().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getRGBELoader().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getHDRCubeTextureLoader().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getPMREMGenerator().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getPMREMCubeUVPacker().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getOutlineEffect().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getExplodeModifier().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getSimplifyModifier().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getSubdivisionModifier().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getTessellateModifier().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();

        ScriptInjector.fromString(ThreeJsExamplesTextResource.IMPL.getTypedArrayUtils().getText())
                .setWindow(ScriptInjector.TOP_WINDOW).inject();


/*        try {
            if (new OrbitControls(null) == null) {
                GWT.log("it is a null");
            }
        } catch (JavaScriptException e) {
            loadJavaScript(JavascriptTextResource.IMPL.getOrbitControls().getText());
        }*/

    }


}
