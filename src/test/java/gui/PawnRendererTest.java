package gui;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class PawnRendererTest {

    @Test public void
    isAPieceRenderer() {
        assertThat( new PawnRenderer(null), instanceOf( PieceRenderer.class ));
    }

    @Test public void
    displaysAsP() {
        assertThat( new PawnRenderer(null).toString(), equalTo( "P" ) );
    }
    
}
