import { Suspense, lazy } from "react";
import VideoWidget from "./video_widget";

// Implement lazy+Promise ourself
// This works for static content or local component
const LazyLocalComponen = lazy(() => 
  //new Promise((resolve) => resolve({ default: () => <h1>Final content</h1> }))
  new Promise((resolve) => resolve({ default: VideoWidget }))
);


// Use lazy on dynamic import
// This is the recommended approach
const LazyLocalComponent = lazy(
    () => import("./video_widget")
);


export default function PresentVideos(){
    return(
        <Suspense fallback={<h3>Content is loading...</h3>}>
            <Comp/>
        </Suspense>
    );
}