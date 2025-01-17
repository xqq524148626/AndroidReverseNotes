package com.tencent.mm.boot.svg.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.os.Looper;
import com.tencent.mm.svg.c;
import com.tencent.smtt.sdk.WebView;

public final class ng extends c {
    private final int height = 115;
    private final int width = 115;

    public final int a(int i, Object... objArr) {
        switch (i) {
            case 0:
                return 115;
            case 1:
                return 115;
            case 2:
                Canvas canvas = (Canvas) objArr[0];
                Looper looper = (Looper) objArr[1];
                Matrix h = c.h(looper);
                float[] g = c.g(looper);
                Paint k = c.k(looper);
                k.setFlags(385);
                k.setStyle(Style.FILL);
                Paint k2 = c.k(looper);
                k2.setFlags(385);
                k2.setStyle(Style.STROKE);
                k.setColor(WebView.NIGHT_MODE_COLOR);
                k2.setStrokeWidth(1.0f);
                k2.setStrokeCap(Cap.BUTT);
                k2.setStrokeJoin(Join.MITER);
                k2.setStrokeMiter(4.0f);
                k2.setPathEffect(null);
                Paint a = c.a(k2, looper);
                a.setStrokeWidth(1.0f);
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, -1018.0f, 0.0f, 1.0f, -386.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                canvas.save();
                g = c.a(g, 1.0f, 0.0f, 1018.0f, 0.0f, 1.0f, 386.0f);
                h.reset();
                h.setValues(g);
                canvas.concat(h);
                Paint a2 = c.a(k, looper);
                a2.setColor(1275068416);
                canvas.save();
                Paint a3 = c.a(a2, looper);
                Path l = c.l(looper);
                l.moveTo(57.5f, 0.0f);
                l.cubicTo(89.25638f, 0.0f, 115.0f, 25.743626f, 115.0f, 57.5f);
                l.cubicTo(115.0f, 89.25638f, 89.25638f, 115.0f, 57.5f, 115.0f);
                l.cubicTo(25.743626f, 115.0f, 0.0f, 89.25638f, 0.0f, 57.5f);
                l.cubicTo(0.0f, 25.743626f, 25.743626f, 0.0f, 57.5f, 0.0f);
                l.close();
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(a, looper);
                a3.setColor(-1);
                a3.setStrokeWidth(6.0f);
                l = c.l(looper);
                l.moveTo(57.5f, 3.0f);
                l.cubicTo(87.59952f, 3.0f, 112.0f, 27.40048f, 112.0f, 57.5f);
                l.cubicTo(112.0f, 87.59952f, 87.59952f, 112.0f, 57.5f, 112.0f);
                l.cubicTo(27.40048f, 112.0f, 3.0f, 87.59952f, 3.0f, 57.5f);
                l.cubicTo(3.0f, 27.40048f, 27.40048f, 3.0f, 57.5f, 3.0f);
                l.close();
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.save();
                a3 = c.a(k, looper);
                a3.setColor(-1);
                l = c.l(looper);
                l.moveTo(41.0f, 43.0f);
                l.cubicTo(41.0f, 41.89543f, 41.89543f, 41.0f, 43.0f, 41.0f);
                l.lineTo(72.0f, 41.0f);
                l.cubicTo(73.10457f, 41.0f, 74.0f, 41.89543f, 74.0f, 43.0f);
                l.lineTo(74.0f, 72.0f);
                l.cubicTo(74.0f, 73.10457f, 73.10457f, 74.0f, 72.0f, 74.0f);
                l.lineTo(43.0f, 74.0f);
                l.cubicTo(41.89543f, 74.0f, 41.0f, 73.10457f, 41.0f, 72.0f);
                l.lineTo(41.0f, 43.0f);
                l.close();
                canvas.drawPath(l, a3);
                canvas.restore();
                canvas.restore();
                canvas.restore();
                c.j(looper);
                break;
        }
        return 0;
    }
}
