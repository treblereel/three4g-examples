package org.treblereel.gwt.three4g.examples.resources;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel on 3/26/18.
 */
public interface ThreeJsExamplesTextResource extends ClientBundle{

    ThreeJsExamplesTextResource IMPL = GWT.create(ThreeJsExamplesTextResource.class);

    @Source("js/controls/OrbitControls.js")
    TextResource getThreeOrbitControlsJS();

    @Source("js/DecalGeometry.js")
    TextResource getThreeDecalGeometryJS();

    @Source("js/ConvexGeometry.js")
    TextResource getThreeConvexGeometryJS();

    @Source("js/SceneUtils.js")
    TextResource getThreeSceneUtilsJS();

    @Source("js/BufferGeometryUtils.js")
    TextResource getThreeBufferGeometryUtilsJS();

    @Source("js/renderers/CSS2DRenderer.js")
    TextResource getThreeCSS2DRendererJS();

    @Source("js/renderers/CSS3DRenderer.js")
    TextResource getThreeCSS3DRendererJS();

    @Source("js/renderers/SVGRenderer.js")
    TextResource getThreeSVGRendererJS();

    @Source("js/QuickHull.js")
    TextResource getThreeQuickHullJS();

    @Source("js/Lut.js")
    TextResource getThreeLutJS();

    @Source("js/GLTFExporter.js")
    TextResource getThreeGLTFExporterJS();

    @Source("js/loaders/BabylonLoader.js")
    TextResource getThreeBabylonLoaderJS();

    @Source("js/loaders/GLTFLoader.js")
    TextResource getThreeGLTFLoaderJS();

    @Source("js/loaders/DRACOLoader.js")
    TextResource getThreeDRACOLoaderJS();

    @Source("js/LoaderSupport.js")
    TextResource getThreeLoaderSupportJS();

    @Source("js/loaders/OBJLoader.js")
    TextResource getThreeOBJLoaderJS();

    @Source("js/loaders/OBJLoader2.js")
    TextResource getThreeOBJLoader2JS();

    @Source("js/loaders/ColladaLoader.js")
    TextResource getThreeColladaLoaderJS();

    @Source("js/loaders/PCDLoader.js")
    TextResource getThreePCDLoaderJS();

    @Source("js/loaders/PDBLoader.js")
    TextResource getThreePDBLoaderJS();

    @Source("js/loaders/SVGLoader.js")
    TextResource getThreeSVGLoaderJS();

    @Source("js/loaders/TGALoader.js")
    TextResource getThreeTGALoaderJS();

    @Source("js/loaders/PRWMLoader.js")
    TextResource getThreePRWMLoaderJS();

    @Source("js/WebVR.js")
    TextResource getThreeWebVRJS();

    @Source("js/controls/DaydreamController.js")
    TextResource getThreeDaydreamControllerJS();

    @Source("js/controls/ViveController.js")
    TextResource getThreeViveControllerJS();

    @Source("js/controls/FirstPersonControls.js")
    TextResource getThreeFirstPersonControlsJS();

    @Source("js/loaders/TDSLoader.js")
    TextResource getTDSLoader();

    @Source("js/loaders/FBXLoader.js")
    TextResource getFBXLoader();

    //needed by FBXLoader.js
    @Source("js/loaders/zlib.js")
    TextResource getZlib();

    @Source("js/loaders/MTLLoader.js")
    TextResource getMTLLoader();

    @Source("js/Lensflare.js")
    TextResource getLensflare();

    @Source("js/Reflector.js")
    TextResource getReflector();

    @Source("js/controls/DragControls.js")
    TextResource getDragControls();

    @Source("js/renderers/CanvasRenderer.js")
    TextResource getCanvasRenderer();

    @Source("js/Projector.js")
    TextResource getProjector();

    @Source("js/loaders/PLYLoader.js")
    TextResource getPLYLoader();

    @Source("js/loaders/RGBELoader.js")
    TextResource getRGBELoader();

    @Source("js/loaders/HDRCubeTextureLoader.js")
    TextResource getHDRCubeTextureLoader();

    @Source("js/loaders/PMREMGenerator.js")
    TextResource getPMREMGenerator();

    @Source("js/PMREMCubeUVPacker.js")
    TextResource getPMREMCubeUVPacker();

    @Source("js/effects/OutlineEffect.js")
    TextResource getOutlineEffect();

    @Source("js/modifers/ExplodeModifier.js")
    TextResource getExplodeModifier();

    @Source("js/modifers/SimplifyModifier.js")
    TextResource getSimplifyModifier();

    @Source("js/modifers/SubdivisionModifier.js")
    TextResource getSubdivisionModifier();

    @Source("js/modifers/TessellateModifier.js")
    TextResource getTessellateModifier();

    @Source("js/utils/TypedArrayUtils.js")
    TextResource getTypedArrayUtils();
}
