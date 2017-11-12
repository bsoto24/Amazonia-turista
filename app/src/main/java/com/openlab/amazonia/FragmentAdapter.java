package com.openlab.amazonia;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Bryam Soto on 04/11/2017.
 */

public class FragmentAdapter extends FragmentPagerAdapter {
    protected static final String[] TITULO = new String[]{"Tickets digitales", "Pasaporte SERNANP", "Guías turísticos"};
    protected static final String[] DESCRIPCION = new String[]{"Ahora puedes utilizar los tickets que compras y utilizarlos mediante tu smartphone", "Tu pasaporte digital te permitirá visitar 10 áreas naturales protegidas", "Puedes contactar a los mejores guías turísticos de cada área natural"};
    protected static final int[] IMAGEN = new int[]{R.drawable.img_tickets, R.drawable.img_pasaporte, R.drawable.img_tourist_guide};

    private int mCount = TITULO.length;

    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return new TutorialFragment(IMAGEN[position], TITULO[position], DESCRIPCION[position]);
    }

    @Override
    public int getCount() {
        return mCount;
    }

}
