import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Letrero {
    public int y, x;
    private Animation animation;
    private float tiempo;
    private TextureRegion regionMovimiento[];
    private Texture imagen;
    private TextureRegion frameActual;
    pri
    public Letrero(int y, int x) {

        this.y = y;
        this.x = x;

        imagen=new Texture(Ggdx.files.internal("GAME_LAND.png"));
        TexttureRegion temporal[][]=TextuteRegion.split(imagen,imagen.getWidth()/3,imagen.getHeight());

        regionMovimiento=new TextureRegion[3];
        for(int i=0;i<3;i++) regionMovimiento[i]=temporal[0][i];
        animation=new Animation(1/2f,regionMovimiento);
        tiempo=0f;
    }

    public void render(final SpriteBatch batch) {
        tiempo += Gdx.graphics.getDeltaTime();
        frameActual = animation.getKeyframe(tiempo. true);
        batch.draw(frameActual, x, y);
    }

}








        }