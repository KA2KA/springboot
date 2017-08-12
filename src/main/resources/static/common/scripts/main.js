/**
 * Created by Hem on 2017/8/11.
 */
requirejs.config({
    baseUrl: '../../common/scripts/lib/',
    paths: {
        jquery: 'jquery-3.2.1',
        bootstrap: 'bootstrap'
    }
});

require(['jquery'], function ($) {
    $(function () {
        alert("Hello World!");
    })
})
