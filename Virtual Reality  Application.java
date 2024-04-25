import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;

public class MyVRApplication extends SimpleApplication {

    public static void main(String[] args) {
        MyVRApplication app = new MyVRApplication();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        // Create a box geometry
        Box boxMesh = new Box(1, 1, 1);
        Geometry boxGeometry = new Geometry("Box", boxMesh);

        // Create a material and set its color
        Material material = new Material(assetManager, "Common/MatDefs/Misc/Unshaded.j3md");
        material.setColor("Color", ColorRGBA.Blue);
        boxGeometry.setMaterial(material);

        // Attach the box geometry to the root node
        rootNode.attachChild(boxGeometry);

        // Move the box away from the camera
        boxGeometry.setLocalTranslation(0, 0, -5);
    }

    @Override
    public void simpleUpdate(float tpf) {
        // Update logic here
    }
}
