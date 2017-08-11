/**
 * Created by Hem on 2017/8/11.
 */
requirejs.config({
    //By default load any module IDs from js/lib
    // baseUrl: 'common/lib',
    //except, if the module ID starts with "app",
    //load it from the js/app directory. paths
    //config is relative to the baseUrl, and
    //never includes a ".js" extension since
    //the paths config could be for a directory.
    paths: {
        jquery:'common/jquery-3.2.1',
        bootstrap:'common/bootstrap'

    }
});
// Start the main app logic.
requirejs(['jquery', 'canvas', 'app/sub'],
    function ($, canvas, sub) {
        //jQuery, canvas and the app/sub module are all
        //loaded and can be used here now.
    });