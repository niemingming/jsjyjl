package com.nmm.study;

import com.nmm.study.model.Source;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataLoader {

    public List<Source> loadData(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(path));
        List<Source> datas = new ArrayList<Source>();
        String str = null;
        while((str = br.readLine()) != null) {
            String[] strs = str.split("\t");
            if (strs.length != 4) {
                System.out.println(str);
            }else {
                long date = Long.parseLong(strs[0].split(" ")[0].replace("-",""));
                double data = Double.parseDouble(strs[2]);

                Source source = new Source();
                source.setDate(date);
                source.setData(data);
                datas.add(source);
            }
        }
        System.out.println(datas.size());
        return datas;
    }
}
