public class Game {
    private int frame;
    private int rolls;
    private static int  PINS;
    private int score;
    private int pinsUp;

    public Game() {
        this.frame = 0;
        this.rolls = 0;
        this.score = 0;
        PINS = 10;
        this.pinsUp = PINS;
    }

    public int roll(int pinsDown){
        setPinsUp(pinsDown - PINS);
        this.score += pinsDown;
        controlRolls();
        return pinsDown;
    }
    public void score(){
        System.out.println(this.score);
    }

    public void controlRolls(){
        if (this.rolls == 2){
            this.rolls = 0;
            controlFrame();
        } else {
            this.rolls ++;
        }
    }
    public void prepareRoll(int pinsDown){

        if (pinsDown < getPinsUp()){
            roll(pinsDown);
        } else {
            rollRandomPins();
        }
    }
    public void rollRandomPins(){
        int randomNumberOfPins = (int) Math.floor(Math.random()*10+1);
        prepareRoll(randomNumberOfPins);
    }
    public void controlFrame(){
        if (this.frame == 10){
            endGame();
        }else{
            this.frame ++;
        }
    }
    public void endGame(){
        System.out.println("Your final puntuation is "+ this.score);
        System.exit(0);
    }
    public int getPinsUp() {
        return pinsUp;
    }

    public void setPinsUp(int pinsUp) {
        this.pinsUp = pinsUp;
    }
    public int getFrame(){
        return frame;
    }










}
