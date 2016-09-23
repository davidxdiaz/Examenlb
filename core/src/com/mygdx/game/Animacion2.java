import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Animacion2 {
    public int y, x;
    private Animation animation;
    private float tiempo;
    private TextureRegion regionMovimiento[];
    private Texture imagen;
    private TextureRegion frameActual;
    public Animacion2(int y, int x) {

        this.y = y;
        this.x = x;

        imagen=new Texture(Gdx.files.internal("img2.png"));
        TexttureRegion temporal[][]=TextuteRegion.split(imagen,imagen.getWidth()/3,imagen.getHeight()/4);

        regionMovimiento=new TextureRegion[12];
        int max=0;
        for(int i=0;i<4;i++){
            for(int e=0;e<3;e++){
                regionMovimiento[max]=temporal[i][e];
                max++;
            }

        }
        animation=new Animation(1/10f,regionMovimiento);
        tiempo=0f;
    }

    public void render(final SpriteBatch batch) {
        tiempo += Gdx.graphics.getDeltaTime();
        frameActual = animation.getKeyframe(tiempo. true);
        batch.draw(frameActual, x, y);
    }

}
