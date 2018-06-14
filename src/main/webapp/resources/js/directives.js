'use strict';

/* Directives */

var AppDirectives = angular.module('AngularSpringmvcMybatis.directives', []);

AppDirectives.directive('appVersion', ['version', function (version) {
    return function (scope, elm, attrs) {
        elm.text(version);
    };
}]);
