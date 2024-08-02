package Assignment_8;

public class Q3 {
    public static void main(String[] args) {
        Video v1 = new Video("5months", "How to crack Java interview", 32453, 3453, 50);
        System.out.println(v1.getVideold());
        System.out.println(v1);
    }
}

class Video{
    private String videold;
    private String title;
    private int views;
    private int likes;
    private int totalVideos;

    Video(String videold,String title,int views,int likes,int totalVideos){
        this.videold=videold;
        this.title=title;
        this.views=views;
        this.likes=likes;
        this.totalVideos=totalVideos;
    }

    public void setVideold(String videold){
        this.videold=videold;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setViews(int views){
        this.views=views;
    }
    public void setLikes(int lik){
        this.likes=likes;
    }
    public void setTotalVideos(int totalVideos){
        this.totalVideos=totalVideos;
    }
    public String getVideold(){
        return videold;
    }
    public String getTitle(){
        return title;
    }
    public int getViews(){
        return views;
    }
    public int getLikes(){
        return likes;
    }
    public int getTotalVideos(){
        return totalVideos;
    }
    @Override
    public String toString(){
        return "VideoStats{How old is video:"+videold+", Title:"+title+", Views:"+views+", Likes;"+likes+
                ", TotalVideos:"+totalVideos+'}';
    }
}