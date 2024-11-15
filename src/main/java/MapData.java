import java.util.List;

public class MapData {
    private int compressionlevel;
    private int height;
    private boolean infinite;
    private List<Layer> layers;

    public List<Tilesets> getTilesets() {
        return tilesets;
    }

    public void setTilesets(List<Tilesets> tilesets) {
        this.tilesets = tilesets;
    }

    private List<Tilesets> tilesets;

    // Getters and Setters
    public int getCompressionlevel() {
        return compressionlevel;
    }

    public void setCompressionlevel(int compressionlevel) {
        this.compressionlevel = compressionlevel;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isInfinite() {
        return infinite;
    }

    public void setInfinite(boolean infinite) {
        this.infinite = infinite;
    }

    public List<Layer> getLayers() {
        return layers;
    }

    public void setLayers(List<Layer> layers) {
        this.layers = layers;
    }
}
class  Tilesets{
    public List<Tiles> getTiles() {
        return tiles;
    }

    public void setTiles(List<Tiles> tiles) {
        this.tiles = tiles;
    }

    private List<Tiles>  tiles;
}
class  Tiles{
    public int getId() {
        return id;
    }



    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getImageheight() {
        return imageheight;
    }

    public void setImageheight(int imageheight) {
        this.imageheight = imageheight;
    }

    public int getImagewidth() {
        return imagewidth;
    }

    public void setImagewidth(int imagewidth) {
        this.imagewidth = imagewidth;
    }

    private int id;
    private String image;
    private int imageheight;
    private int imagewidth;
}

class Layer {
    private int[] data;
    private int height;
    private int id;
    private String name;
    private double opacity;
    private String type;
    private boolean visible;
    private int width;
    private int x;
    private int y;

    // Getters and Setters
    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOpacity() {
        return opacity;
    }

    public void setOpacity(double opacity) {
        this.opacity = opacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
