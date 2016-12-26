class RealImage implements Image {

    private String fileName;

    RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println(fileName + " is displaying now ");
    }

    private void loadFromDisk(String fileName){
        System.out.println(fileName + " is loading now");
    }
}