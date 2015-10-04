(ns csv-utils.core
  (:require [clojure.java.io :as io])
  (:use clojure.java.io)
  (:use clojure-csv.core)
  (:use clojure.java.data))

;; Lesen der csv-Dateien
(def filepaths ["/home/jdienst/test1" "/home/jdienst/test2"])

(defn readcsvfrom
  [path]
  (if (.exists (as-file path))
    (parse-csv (io/reader path) :delimiter \;)
    nil))

(defn processCSV
  [filepaths]
  (map readcsvfrom filepaths))

;; Explizite Konvertierung zu Java
(import '(java.util List))
(defn java-processCSV
  [filepath]
  (to-java List (processCSV filepaths)))

;; Erzeugen einer Java-Instanz
(import person.Person)
(def bob (Person. "Bob" 30))
(.getName bob)
(to-java Person {:name "Johannes" :age 29})

;; Erzeugt Java-Instanz aus Liste: Direkte Java-Objekte
(defn createjavaperson [person]
  (let [ [name age] person]
    (Person. name (Long/valueOf age))))

;; Erzeugt Java-Instanz aus Liste: Benutzt to-java
(defn createjavaperson [person]
  (let [ [name age] person]
    (to-java Person {:name name :age (Long/valueOf age)})))

;; Erzeugt Liste mit Java-Instanzen aus
;; allen Dateien
(defn readPersonsToJava
  [filepaths]
  (loop [filepaths filepaths
         result []]
    (if (empty? filepaths)
      result
      (recur (rest filepaths)
             (conj result
               (map createjavaperson
                 (readcsvfrom (first filepaths))))))))

;; sum-age fuer from-java
(defn sum-age 
  [persons]
  (reduce (fn [sum person] (+ sum (get person :age))) 0 persons))