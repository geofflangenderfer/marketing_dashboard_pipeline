module Main exposing (..)

-- Input a user name and password. Make sure the password matches.
--
-- Read how it works:
--   https://guide.elm-lang.org/architecture/forms.html
--

import Browser
import Html exposing (..)
import Html.Attributes exposing (..)
import Html.Events exposing (onInput)



-- MAIN


main =
  Browser.sandbox { init = init, update = update, view = view }



-- MODEL


type alias Model =
  { email : String
  , password : String
  }


init : Model
init =
  Model "" "" 



-- UPDATE


type Msg
  = Email String
  | Password String


update : Msg -> Model -> Model
update msg model =
  case msg of
    Email email ->
      { model | email = email }

    Password password ->
      { model | password = password }


-- VIEW


view : Model -> Html Msg
view model =
  
  div []
    [ h1 [] [text "Reporting: Automated"]
    , viewInput "email" "Username" model.email Email
    , viewInput "password" "Password" model.password Password
    , button [] [ text "Login" ]
    ]


viewInput : String -> String -> String -> (String -> msg) -> Html msg
viewInput t p v toMsg =
  input [ type_ t, placeholder p, value v, onInput toMsg ] []


