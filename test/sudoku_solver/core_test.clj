(ns sudoku-solver.core-test
  (:require [clojure.test :refer :all]
            [sudoku-solver.core :refer :all]))

(deftest parse-puzzle-file-test
  (testing "parse-puzzle-file"
    (is (=
         [[nil nil \8 nil nil nil nil \3 \1]
          [nil nil nil nil \6 nil \2 \7 nil]
          [\7 nil nil \1 \8 \2 nil \6 nil]
          [\9 nil nil \5 \3 \4 \1 nil nil]
          [nil nil \5 \6 nil \8 \7 nil nil]
          [nil nil \6 \7 \2 \1 nil nil \5]
          [nil \3 nil \2 \1 \9 nil nil \7]
          [nil \8 \2 nil \4 nil nil nil nil]
          [\1 \7 nil nil nil nil \4 nil nil]]
         (parse-puzzle-file "resources/easy")))))
