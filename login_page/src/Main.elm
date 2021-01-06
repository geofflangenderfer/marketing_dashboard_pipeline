module Main exposing (..)
type Model
  = Loading 
--what is this for?  | LoadedOne User
  | LoadingProblem Problem
  | Loaded LoadedModel

type Problem
  = ServerProblem Http.Error
  | DatabaseProblem String
   
type alias LoadedModel = 
  { user: User
  , problem: Maybe Problem
  , integrations: List Integration
  }

viewLoaded: LoadedModel -> Html Msg

view: Model -> Html Msg
view model = 
  case model of 
    Loading ->
      viewLoadingSpinner
    LoadedOne loadedUser ->
    LoadingProblem loadProblem ->
    Loaded loadedModel ->
      viewLoaded loadedModel
      
      
