package Chapter07_TheAdapterAndFacadePattern.Facade;

public class HomeTheaterFacade {
    Amplifier amp;
    CdPlayer cd;
    DvdPlayer dvd;
    PopcornPopper popper;
    Projector projector;
    Screen screen;
    TheaterLights lights;
    Tuner tuner;

    public HomeTheaterFacade(Amplifier amp, CdPlayer cd, DvdPlayer dvd, PopcornPopper popper, Projector projector, Screen screen, TheaterLights lights, Tuner tuner) {
        this.amp = amp;
        this.cd = cd;
        this.dvd = dvd;
        this.popper = popper;
        this.projector = projector;
        this.screen = screen;
        this.lights = lights;
        this.tuner = tuner;
    }
}
