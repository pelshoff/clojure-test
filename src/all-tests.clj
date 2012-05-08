(ns clojure-test (:use clojure.test))
(require 'functions.maths-test)
(require 'sorting.bubblesort-test)
(run-tests 'functions 'sorting)