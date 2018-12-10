package com.nmm.study;

import com.nmm.study.alg.AlgCounter;
import com.nmm.study.model.Source;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.io.IOException;
import java.util.List;

public class AlgMain {

    public static void main(String[] args) throws IOException {
        List<Source> sources = new DataLoader().loadData("bb.txt");
        AlgCounter counter = new AlgCounter();
        long start = System.currentTimeMillis();
        for (Source source:sources) {
            counter.count(source);
        }
        System.out.println("总计耗时：" + (System.currentTimeMillis() - start));
        System.out.println("符合条件的数据共有：" + counter.getTotal());
    }
}
