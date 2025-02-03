selectDetections();
runPlugin('qupath.lib.algorithms.IntensityFeaturesPlugin', '{"pixelSizeMicrons":0.325,"region":"ROI","tileSizeMicrons":25.0,"channel1":true,"channel2":false,"channel3":false,"channel4":false,"channel5":false,"channel6":false,"channel7":false,"channel8":falseerue,"channel9":false,"channel10":false,"channel11":false,"channel12":false,"channel13":false,"channel14":false,"channel15":false,"channel16":false,"channel17":false,"channel18":false,"channel19":false,"doMean":true,"doStdDev":false,"doMinMax":false,"doMedian":false,"doHaralick":false,"haralickMin":NaN,"haralickMax":NaN,"haralickDistance":1,"haralickBins":32}')
runObjectClassifier("Anuclear");
selectObjectsByClassification("Other");
clearSelectedObjects(true);
selectDetections();
runPlugin('qupath.lib.algorithms.IntensityFeaturesPlugin', '{"pixelSizeMicrons":0.325,"region":"ROI","tileSizeMicrons":25.0,"channel1":false,"channel2":true,"channel3":false,"channel4":false,"channel5":false,"channel6":false,"channel7":false,"channel8":false,"channel9":false,"channel10":false,"channel11":false,"channel12":false,"channel13":false,"channel14":false,"channel15":false,"channel16":true,"channel17":true,"channel18":false,"channel19":false,"doMean":true,"doStdDev":false,"doMinMax":false,"doMedian":false,"doHaralick":false,"haralickMin":NaN,"haralickMax":NaN,"haralickDistance":1,"haralickBins":32}')
