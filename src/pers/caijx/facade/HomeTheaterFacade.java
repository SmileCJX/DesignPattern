package pers.caijx.facade;

/**
 * @ClassName HomeTheaterFacade
 * @Description: 家庭影院外观类
 * @Author JunXiangCai
 * @Date 2019/11/20
 * @Version V1.0
 **/
public class HomeTheaterFacade {

    // 定义各个子系统对象
    private TheaterLight theaterLight;
    private Popcorn popcorn;
    private Stereo stereo;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    /**
     * 构造器
     */
    public HomeTheaterFacade() {
        this.theaterLight = TheaterLight.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.stereo = Stereo.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.dvdPlayer = DVDPlayer.getInstance();
    }

    /**
     * 操作分成4步
     */
    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        theaterLight.dim();
    }

    /**
     * 播放
     */
    public void play() {
        dvdPlayer.play();
    }

    /**
     * 暂停
     */
    public void pause() {
        dvdPlayer.pause();
    }

    /**
     * 停止播放
     */
    public void end() {
        popcorn.off();
        theaterLight.bright();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
    }
}
