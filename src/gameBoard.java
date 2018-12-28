public class gameBoard {
    private int Height, Width, Depth, SizeOfWL;

    public gameBoard(int height, int width, int depth, int sizeOfWL) {
        Height = height;
        Width = width;
        Depth = depth;
        SizeOfWL = sizeOfWL;
    }

    public int getHeight() {
        return Height;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public int getWidth() {
        return Width;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public int getDepth() {
        return Depth;
    }

    public void setDepth(int depth) {
        Depth = depth;
    }

    public int getSizeOfWL() {
        return SizeOfWL;
    }

    public void setSizeOfWL(int sizeOfWL) {
        SizeOfWL = sizeOfWL;
    }
}
