class RealVideo implements Video {

    private String fileName;

    RealVideo(String fileName){
        this.fileName = fileName;
        loadingFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println(fileName + " is displaying now ");
    }

    private void loadingFromDisk(String fileName){
        System.out.println(fileName + " is loading now");
    }
}