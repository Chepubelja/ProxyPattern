class ProxyVideo implements Video {

    private RealVideo realImage;
    private String fileName;

    ProxyVideo(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealVideo(fileName);
        }
        realImage.display();
    }
}