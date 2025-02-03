setImageType('FLUORESCENCE');
createAnnotationsFromPixelClassifier("Tissue", 1000.0, 1000.0, "INCLUDE_IGNORED")

selectObjectsByClassification("Region*");
runPlugin('qupath.imagej.detect.cells.WatershedCellDetection', '{"detectionImage":"Hoechst","requestedPixelSizeMicrons":0.325,"backgroundRadiusMicrons":8.0,"backgroundByReconstruction":true,"medianRadiusMicrons":0.0,"sigmaMicrons":1.0,"minAreaMicrons":10.0,"maxAreaMicrons":400.0,"threshold":500.0,"watershedPostProcess":true,"cellExpansionMicrons":5.0,"includeNuclei":true,"smoothBoundaries":true,"makeMeasurements":true}')

createAnnotationsFromPixelClassifier("TumorPixelClassifier", 500.0, 500.0)

