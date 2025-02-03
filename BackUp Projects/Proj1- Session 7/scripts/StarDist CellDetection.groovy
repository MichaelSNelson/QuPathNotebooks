setImageType('FLUORESCENCE');
createAnnotationsFromPixelClassifier("Tissue", 1000.0, 1000.0, "INCLUDE_IGNORED")

selectObjectsByClassification("Region*");

qupath.ext.instanseg.core.InstanSeg.builder()
    .modelPath("C:/Users/smcardle/Documents/InstanSeg Models/fluorescence_nuclei_and_cells")
    .device("cpu")
    .inputChannels([ColorTransforms.createChannelExtractor("Hoechst"), ColorTransforms.createChannelExtractor("CD11c"), ColorTransforms.createChannelExtractor("CD68"), ColorTransforms.createChannelExtractor("CD163"), ColorTransforms.createChannelExtractor("CD20"), ColorTransforms.createChannelExtractor("CD4"), ColorTransforms.createChannelExtractor("CD8a"), ColorTransforms.createChannelExtractor("CD45RO"), ColorTransforms.createChannelExtractor("PD1"), ColorTransforms.createChannelExtractor("CD45"), ColorTransforms.createChannelExtractor("S100a")])
    .outputChannels()
    .tileDims(512)
    .interTilePadding(16)
    .nThreads(4)
    .makeMeasurements(false)
    .randomColors(false)
    .build()
    .detectObjects()

createAnnotationsFromPixelClassifier("TumorPixelClassifier", 500.0, 500.0)

