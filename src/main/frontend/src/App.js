import {useEffect, useState} from "react";
import axios from "axios";

function App() {
  const [example, setExample] = useState('');

  useEffect(() => {
    axios.get('/test')
        .then((res) => {
          console.log(res)
          setExample(res.data);
        })
  }, []);

  return (
      <div className="App">
        컨트롤러에서 받아온 값 : {example}
      </div>
  );
}

export default App;
