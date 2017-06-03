(ns leiningen.new.precept
  (:use [leiningen.new.templates :only [renderer name-to-path sanitize-ns ->files]]))

(def render (renderer "precept"))

(defn precept
  [name]
  (let [data {:name name
              :ns-name (sanitize-ns name)
              :sanitized (name-to-path name)}]
    (->files data ["dev/clj/precept/todomvc/figwheel.clj" (render "dev/clj/precept/todomvc/figwheel.clj" data)]
["src/cljs/precept/todomvc/rules.cljs" (render "src/cljs/precept/todomvc/rules.cljs" data)]
["dev/cljs/precept/todomvc/app.cljs" (render "dev/cljs/precept/todomvc/app.cljs" data)]
["src/cljs/precept/todomvc/views.cljs" (render "src/cljs/precept/todomvc/views.cljs" data)]
["dev/clj/user.clj" (render "dev/clj/user.clj" data)]
["src/cljs/precept/todomvc/facts.cljs" (render "src/cljs/precept/todomvc/facts.cljs" data)]
["project.clj" (render "project.clj" data)]
["src/cljs/precept/todomvc/core.cljs" (render "src/cljs/precept/todomvc/core.cljs" data)]
["dev/clj/precept/.DS_Store" (render "dev/clj/precept/.DS_Store")]
["resources/.DS_Store" (render "resources/.DS_Store")]
["dev/clj/.DS_Store" (render "dev/clj/.DS_Store")]
["dev/cljs/precept/.DS_Store" (render "dev/cljs/precept/.DS_Store")]
["dev/cljs/precept/todomvc/.DS_Store" (render "dev/cljs/precept/todomvc/.DS_Store")]
["src/cljs/precept/todomvc/schema.cljc" (render "src/cljs/precept/todomvc/schema.cljc")]
["dev/cljs/.DS_Store" (render "dev/cljs/.DS_Store")]
["resources/public/index.html" (render "resources/public/index.html")]
["resources/public/.DS_Store" (render "resources/public/.DS_Store")]
["src/cljs/precept/.DS_Store" (render "src/cljs/precept/.DS_Store")]
["resources/public/todos.css" (render "resources/public/todos.css")]
["src/cljs/.DS_Store" (render "src/cljs/.DS_Store")]
)))