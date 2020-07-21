package com.segurosx.models;

import java.io.FileReader;
import java.util.ArrayList;

public interface IExportableArray {
    ArrayList<String> aArray();
    ArrayList<String> aArrayFromCsv(String rutaArchivo);
    // CSVReader csvReader = new CSVReader(new FileReader(archCSV));
}