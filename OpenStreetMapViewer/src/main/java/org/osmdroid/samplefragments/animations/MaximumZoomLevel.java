package org.osmdroid.samplefragments.animations;

import android.widget.Toast;
import java.util.Locale;
import org.osmdroid.events.MapListener;
import org.osmdroid.events.ScrollEvent;
import org.osmdroid.events.ZoomEvent;
import org.osmdroid.samplefragments.BaseSampleFragment;

/**
 * Demonstrates interaction of double tab zoom with maximum zoom level
 * created on 10/18/2017.
 * https://github.com/osmdroid/osmdroid/issues/743
 *
 * @author Maradox
 * @since 6.0.0
 */

public class MaximumZoomLevel extends BaseSampleFragment implements MapListener {

    @Override
    public String getSampleTitle() {
        return "Maximum Zoom Level";
    }

    @Override
    protected void addOverlays() {
        super.addOverlays();
        mMapView.setMaxZoomLevel(5);
        mMapView.setMapListener(this);
    }

    @Override
    public boolean onScroll(ScrollEvent scrollEvent) {
        return false;
    }

    @Override
    public boolean onZoom(ZoomEvent zoomEvent) {
        String zoomLevel = String.format(Locale.getDefault(), "%.2f", zoomEvent.getZoomLevel());
        Toast.makeText(getContext(), "Zoom to "+zoomLevel, Toast.LENGTH_SHORT).show();
        return false;
    }

}
