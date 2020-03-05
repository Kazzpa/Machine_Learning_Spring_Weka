package com.derek.ml.controllers;

import com.derek.ml.models.ResultFilter;
import com.derek.ml.services.FeatureReductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(path = "/featureReduction")
public class FeatureReductionController {


    @Autowired
    private FeatureReductionService featureSelectionService;

    //TODO USE JSON
    @GetMapping(path = "/pca", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResultFilter handleFeatureReduction() throws Exception {
        return featureSelectionService.handlePCAFeatures();
    }

    @GetMapping(path = "/rp", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String handleRP() throws Exception {
        return featureSelectionService.handleRandomizedProjectionFeatures();
    }


    @GetMapping(path = "/cfs", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public String handleCfsSubsetEval() throws Exception {
        return featureSelectionService.handleCFSSubsetEval();
    }
/** TODO: NOT WORKING ICA
    @ResponseBody
    @RequestMapping(value ="/ica", method={RequestMethod.GET})
    public String handleICA() throws Exception{
        return featureReductionService.handleICAFeatures();
    }
 */
    @GetMapping(path = "/rp/plot", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void handlePlotRp() throws Exception {
        featureSelectionService.plotRP();
    }

    @GetMapping(path = "/pca/plot", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void handlePlotPCA() throws Exception {
        featureSelectionService.plotPCA();
    }
/** TODO: NOT WORKING ICA
    @ResponseBody
    @RequestMapping(value ="/ica/plot", method={RequestMethod.GET})
    public void handlePlotICA() throws Exception{
        featureReductionService.plotICA();
    }
*/
}
