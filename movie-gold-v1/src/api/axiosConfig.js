import axios from 'axios';

// configure and export the axios object used to make HTTP request to the remote api(our java backend)

export default axios.create({
    baseURL:'http://9c96-103-106-239-104.ap.ngrok.io',
    headers:{"ngrok-skip-browser-warning":"true"}
});